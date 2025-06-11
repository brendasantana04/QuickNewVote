import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Eleitor } from '../models/eleitor.model';

@Injectable({
providedIn: 'root'
})
export class EleitorService {
private apiUrl = 'http://localhost:8080/api/menu';

constructor(private http: HttpClient) { }

  cadastrarEleitor(eleitor: Eleitor): Observable<string> {
    return this.http.post<string>(`${this.apiUrl}/eleitor`, eleitor);
  }

  listarEleitores(): Observable<Eleitor[]> {
    return this.http.get<Eleitor[]>(`${this.apiUrl}/eleitor`);
  }
}

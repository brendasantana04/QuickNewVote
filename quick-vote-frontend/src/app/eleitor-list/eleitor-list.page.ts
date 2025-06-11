import { Component, OnInit } from '@angular/core';
import { EleitorService } from '../../services/eleitor.service';
import { Eleitor } from '../../models/eleitor.model';
import { Router, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import {
IonHeader,
IonToolbar,
IonTitle,
IonContent,
IonList,
IonItem,
IonLabel,
IonButton
} from '@ionic/angular/standalone';

@Component({
selector: 'app-eleitor-list',
templateUrl: './eleitor-list.page.html',
styleUrls: ['./eleitor-list.page.scss'],
standalone: true,
imports: [
CommonModule,
RouterModule,
IonHeader,
IonToolbar,
IonTitle,
IonContent,
IonList,
IonItem,
IonLabel,
IonButton
]
})
export class EleitorListPage implements OnInit {
eleitores: Eleitor[] = [];

constructor(
    private eleitorService: EleitorService,
    private router: Router
  ) { }

  ngOnInit() {
    this.carregarEleitores();
  }

  carregarEleitores() {
    this.eleitorService.listarEleitores().subscribe({
      next: (eleitores) => {
        this.eleitores = eleitores;
      },
      error: (error) => {
        console.error('Erro ao carregar eleitores:', error);
      }
    });
  }

  novoEleitor() {
    this.router.navigate(['/eleitor-form']);
  }

  editarEleitor(eleitor: Eleitor) {
    this.router.navigate(['/eleitor-form', eleitor.id]); // Simplificado
  }
}

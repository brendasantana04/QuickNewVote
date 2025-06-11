import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { HomePage } from './pages/home/home.page';
import { EleitorListPage } from './pages/eleitor-list/eleitor-list.page';
import { EleitorFormPage } from './pages/eleitor-form/eleitor-form.page';

const routes: Routes = [
{ path: '', redirectTo: 'home', pathMatch: 'full' },
{ path: 'home', component: HomePage },
{ path: 'eleitor-list', component: EleitorListPage },
{ path: 'eleitor-form', component: EleitorFormPage },
{ path: 'eleitor-form/:id', component: EleitorFormPage },
];

@NgModule({
imports: [
RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

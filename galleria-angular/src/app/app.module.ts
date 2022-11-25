import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GalleriaServiceComponent } from './galleria-service/galleria-service.component';
import { HeaderComponent } from './header/header.component';
import { ImmaginiComponent } from './immagini/immagini.component';
import { NomeSitoComponent } from './nome-sito/nome-sito.component';

@NgModule({
  declarations: [
    AppComponent,
    GalleriaServiceComponent,
    HeaderComponent,
    ImmaginiComponent,
    NomeSitoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

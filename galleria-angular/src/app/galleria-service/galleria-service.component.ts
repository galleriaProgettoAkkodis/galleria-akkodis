import { Component, OnInit } from '@angular/core';
import { Galleria } from '../galleria-service/Galleria';
import { Immagine } from '../galleria-service/Immagine';
import { HttpClient } from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})



@Component({
  selector: 'app-galleria-service',
  templateUrl: './galleria-service.component.html',
  styleUrls: ['./galleria-service.component.css']
})
export class GalleriaServiceComponent implements OnInit{

  listaGallerie:string[] = [];
  formAddGalleria!:boolean;
  nomeGalleria!:string;
  showLista!:boolean;
  constructor(private http: HttpClient){}


  ngOnInit(){
    this.showLista = true;
    this.getListaGallerie();
  }

  getListaGallerie(){
    this.http.get('http://localhost:8080/gallery/api').subscribe(
      (data:any)=>{
        this.listaGallerie = data as string[];
        console.log(this.listaGallerie);
      }
    );
  }


  addGalleria(){
    this.http.post('http://localhost:8080/gallery/api', this.nomeGalleria).subscribe(()=> this.getListaGallerie());
  }

  showFormGalleria(){
    this.formAddGalleria = true;
    this.showLista = false;
  }
}

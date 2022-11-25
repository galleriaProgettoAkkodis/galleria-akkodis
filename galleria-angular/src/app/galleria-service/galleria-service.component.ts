import { Component, OnInit } from '@angular/core';
import { Galleria } from '../galleria-service/Galleria';
import { Immagine } from '../galleria-service/Immagine';
import { HttpClient } from '@angular/common/http';
import {Injectable} from '@angular/core';
import {InsertImage} from '../galleria-service/InsertImage';
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
  editingGalleria!:boolean;
  mapImmaginiRandom = new Map<string, string>;
  constructor(private http: HttpClient){}


  fillMapImmaginiRandom(){
    for (let i = 0; i<10;i++) {
      this.mapImmaginiRandom.set("img"+i, "https://picsum.photos/id/1/200/300");
    }
  }

  ngOnInit(){
    this.showLista = true;
    this.editingGalleria = false;
    this.fillMapImmaginiRandom();
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

  showEditingGalleria(){
    this.editingGalleria = true;
  }

  modificaGalleria(galleria: string, url:string){
    this.showLista = false;
    let imgAggiunta = new InsertImage("nomeImg",galleria, url);
    this.http.post('http://localhost:8080/gallery/api/add', imgAggiunta).subscribe();
  }

  addGalleria(){
    this.http.post('http://localhost:8080/gallery/api', this.nomeGalleria).subscribe(()=> this.getListaGallerie());
  }

  showFormGalleria(){
    this.formAddGalleria = true;
    this.showLista = false;
  }
}

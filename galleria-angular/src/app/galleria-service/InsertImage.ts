export class InsertImage {
    titoloImg !: string;
    titoloGalleria !: string;
    urlImmagine !:string;

    getTitoloImg():string {
        return this.titoloImg;
    }

     getTitoloGalleria():string {
        return this.titoloGalleria;
    }

    constructor(titoloImg: string, titoloG: string, urlImmagine:string){
        this.titoloImg = titoloImg;
        this.titoloGalleria = titoloG;
        this.urlImmagine = urlImmagine;
    }
}
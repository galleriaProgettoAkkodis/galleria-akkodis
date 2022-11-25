import { Galleria } from "./Galleria";

export class Immagine {
    id !: number;
    titolo !:string;
    url !: string;
    galleria !: Galleria;

    getTitolo():string {
        return this.titolo;
    }
    getUrl():string {
        return this.url;
    }
}
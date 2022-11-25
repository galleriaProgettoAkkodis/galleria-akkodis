import { Immagine } from "./Immagine";

export class Galleria {
    id !: number;
    titolo !: string;
    immagini:Immagine[] = [];

    getTitolo():string {
        return this.titolo;
    }
    setTitolo(titolo:string) {
        this.titolo = titolo;
    }
}
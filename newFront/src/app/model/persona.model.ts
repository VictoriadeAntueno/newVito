export class persona {
  id?: number;
  nombre: string;
  apellido: string;
  img: string;
  prof: string; 

  constructor(nombre: string, apellido: string, img: string, prof: string) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.img = img;
    this.prof = prof;
    
  }
}
import { by, element } from 'protractor';

export class ProductFormPage { 
    private codigoTextBox  : any;
    private nombreTextBox  : any;
    private precioTextBox  : any;
    private cantidadTextBox: any;
    private guardarButton  : any;


    init(){
        this.codigoTextBox = element(by.css("input[name='codigo']"));
        this.nombreTextBox = element(by.css("input[name='nombre']"));
        this.precioTextBox = element(by.css("input[name='precio']"));
        this.cantidadTextBox = element(by.css("input[name='cantidad']"));       
        this.guardarButton = element(by.buttonText("Guardar"));        
    }

    getButtonGuardarText(){
        return this.guardarButton.getText() as Promise<string>;
    }
    setCodigo(codigo:string){
        this.codigoTextBox.sendKeys(codigo);
    }

    setNombre(nombre:string){
        this.nombreTextBox.sendKeys(nombre);
    }
    setCantidad(cantidad:number){
        this.cantidadTextBox.sendKeys(cantidad);
    }

    setPrecio(precio:number){
        this.precioTextBox.sendKeys(precio);
    }

    clickGuardar(){
        this.guardarButton.click();
    }


}
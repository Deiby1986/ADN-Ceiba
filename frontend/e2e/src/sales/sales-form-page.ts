import { by, element } from 'protractor';

export class SalesFormPage { 
   
    private nombreClienteTextBox  : any;
    private productCodeComboBox  : any;
    private cantidadTextBox: any;
    private guardarButton  : any;

    init(){
        this.nombreClienteTextBox = element(by.css("input[name='cliente']"));
        this.guardarButton = element(by.css("button[name='guardar']")); 
        this.productCodeComboBox = element(by.css("select[formcontrolname='producto']"));
        this.cantidadTextBox = element(by.css("input[formcontrolname='cantidad']"));        
    }

    getButtonGuardarText(){
        return this.guardarButton.getText() as Promise<string>;
    }

    setNombreCliente(nombre:string){
        this.nombreClienteTextBox.sendKeys(nombre);
    }

    setProductName(nombre:string){
        this.productCodeComboBox.sendKeys(nombre);
    }
    setCantidad(cantidad:number){
        this.cantidadTextBox.sendKeys(cantidad);
    }

    clickGuardar(){
        this.guardarButton.click();
    }




}
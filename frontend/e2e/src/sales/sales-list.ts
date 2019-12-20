import { browser, by, element } from 'protractor';
export class SalesListPage { 
    private url = "http://localhost:4200/sales";
    navigateTo() {
        return browser.get(this.url) as Promise<any>;
      }
    getButtonAgregarText() {            
        return element(by.buttonText('Agregar Venta')).getText() as Promise<string>;
    }

    clickButtonAgregar(){
        element(by.buttonText('Agregar Venta')).click();
    }
}

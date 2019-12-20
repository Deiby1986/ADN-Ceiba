import { browser, by, element } from 'protractor';
export class ProductListPage { 
    private url = "http://localhost:4200/products";
    navigateTo() {
        return browser.get(this.url) as Promise<any>;
      }
    getButtonAgregarText() {            
        return element(by.buttonText('Agregar producto')).getText() as Promise<string>;
    }

    clickButtonAgregar(){
        element(by.buttonText('Agregar producto')).click();
    }
}


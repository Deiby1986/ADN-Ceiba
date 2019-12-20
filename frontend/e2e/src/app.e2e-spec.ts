import { browser, logging, by, element } from 'protractor';

import { AppPage } from './app.po';
import { ProductListPage } from './products/products-list';
import { ProductFormPage } from './products/product';
import { SalesListPage } from './sales/sales-list';
import { SalesFormPage } from './sales/sales-form-page';


describe('workspace-project App', () => {
  let page: AppPage;
  let productListPage : ProductListPage;
  let productPage     : ProductFormPage; 
  let salesListPage   : SalesListPage;
  let salesFormPage   : SalesFormPage;

  beforeEach(() => {
    page = new AppPage();
    productListPage = new ProductListPage();
    productPage = new ProductFormPage(); 
    salesListPage = new SalesListPage();  
    salesFormPage = new SalesFormPage(); 
  });

 it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('Ventas');
  });
  


  it('list products', function() {
    productListPage.navigateTo()
    expect(productListPage.getButtonAgregarText()).toBe("Agregar producto");   
  });

  it('save product', function() {
    productListPage.navigateTo();
    expect(productListPage.getButtonAgregarText()).toBe("Agregar producto");       
    productListPage.clickButtonAgregar();
    productPage.init();
    expect(productPage.getButtonGuardarText()).toBe("Guardar");
    let codigoNumber = Math.random()*1000+100;
    let codigo = codigoNumber.toString();
    codigo = codigo.substring(1,2);
    productPage.setCodigo("CODE"+codigo);
    productPage.setNombre("prueba protractor");
    productPage.setCantidad(10);
    productPage.setPrecio(10);
    productPage.clickGuardar();

  });


  it('list sales', function() {
    salesListPage.navigateTo()
    expect(salesListPage.getButtonAgregarText()).toBe("Agregar Venta"); 
    salesListPage.clickButtonAgregar();
  });  
  

  it('purchase first product', function() {
    salesListPage.navigateTo()
    expect(salesListPage.getButtonAgregarText()).toBe("Agregar Venta"); 
    salesFormPage.init();
    salesListPage.clickButtonAgregar();
    expect(salesFormPage.getButtonGuardarText()).toBe("Guardar");
    salesFormPage.setNombreCliente("Prueba protractor");
    salesFormPage.setProductName("prueba");
    salesFormPage.setCantidad(10);
    salesFormPage.clickGuardar();    
    expect(salesListPage.getButtonAgregarText()).toBe("Agregar Venta"); 
  }); 

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});

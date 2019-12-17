import { AppPage } from './app.po';
import { browser, logging, by, element } from 'protractor';


describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('salesfront app is running!');
  });

  it('Should load', function() {
    browser.get('http://localhost:4200/');

    expect(browser.getTitle()).toEqual('Salesfront');
  });
  
  it('list products', function() {
    browser.get('http://localhost:4200/products');
    expect(element(by.tagName('table')).isDisplayed()).toBeTruthy();    
  });
  
  it('save product', function() {
    browser.get('http://localhost:4200/product');
    let codigoNumber = Math.random()*1000;
    let codigo = codigoNumber.toString();
    codigo = codigo.substring(1,2);
    element(by.name('codigo')).sendKeys("PROTRACTOR"+codigo);
    element(by.name('nombre')).sendKeys("Prueba de protractor");
    element(by.name('precio')).sendKeys("10.0");
    element(by.name('cantidad')).sendKeys("10");
    element(by.name('guardar')).click();
    expect(element(by.tagName('table')).isDisplayed()).toBeTruthy();    
  });

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});

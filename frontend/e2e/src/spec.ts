import { browser, by, element } from 'protractor';

describe('Salesfront test', function() {
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
    let codigo = Math.random()*100;
    element(by.name('codigo')).sendKeys("PROTRACTOR"+codigo);
    element(by.name('nombre')).sendKeys("Prueba de protractor");
    element(by.name('precio')).sendKeys("10.0");
    element(by.name('cantidad')).sendKeys("10");
    element(by.name('guardar')).click();
    expect(element(by.tagName('table')).isDisplayed()).toBeTruthy();    
  });
});
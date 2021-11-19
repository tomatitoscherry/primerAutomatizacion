# primerAutomatizacion
primer automatizacion
@Test
public void primerTest(){
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.netflix.com");

    //Para maximizar la pantalla
    driver.manage().window().maximize();

    //Para mover hacia atras
    driver.navigate().back();

    //Avanzar hacia adelante
    driver.navigate().forward();

    //Actualizar la pantalla
    driver.navigate().refresh();

    //trae el primer elemento h1
    WebElement h1= driver.findElement(By.tagName("h1"));
    System.out.println("h1 --> "+ h1.getText());

    //trae una lista de los elementos con la etiqueta a que encuentre
    List<WebElement> listA= driver.findElements(By.tagName("a"));
    for (WebElement we: listA) {
     System.out.println("a --> "+ we.getText());
    }

    //Busca el primer boton de la web
    WebElement button= driver.findElement(By.tagName("button"));

    //Click en el boton
    button.click();

    //busca el elemento con id password e ingresa holamundo en el campo
    driver.findElement(By.id("password")).sendKeys("holamundo");

    driver.findElement(By.name("nombre")).sendKeys("IngresoTexto");

    //Leer el contenido de un elemento
    String contenido= driver.findElement(By.tagName("h1")).getText();

    //Leer el titulo de la web
    String titulo= driver.getTitle();

    //Leer url de la web
    String url= driver.getCurrentUrl();

    //click en el link <a>texto</a> con el texto "Texto"
    driver.findElement(By.linkText("Texto")).click();

    //click en el lick <a>texto algo mas...</> con que contenga "Texto" en alguna parte
    driver.findElement(By.partialLinkText("Texto")).click();

    //click en una opcion del radioButton con el id="Opcion1"
    driver.findElement(By.id("Opcion1")).click();

    //averiguar si la "Opcion2" del radioButton esta seleccionada
    WebElement opcion2= driver.findElement(By.id("Opcion2"));
    if(opcion2.isSelected()==false){ //si no esta seleccionado hace click
        opcion2.click();
    }

    //METODOS DE SELECT

    //Obtener el select meses
    WebElement elementoMeses= driver.findElement(By.id("meses"));
    //Inicio el select para posteriormente acceder a las opciones
    Select meses = new Select(elementoMeses);
    //Selecciono una opcion por el value
    meses.selectByValue("2"); //obtengo febrero
    //Selecciono una opcion por el Texto de la misma
    meses.selectByVisibleText("Enero"); //obtengo enero
    //Selecciono una opcion por el Index del select
    meses.selectByIndex(5); //obtengo mayo

    //ASSERTS PARA VALIDAR RESULTADOS DE TEST
    Assert.assertEquals(retornoDelMetodo(), "resultado esperado");

    //Cierra la ventana del navegador
    driver.close();

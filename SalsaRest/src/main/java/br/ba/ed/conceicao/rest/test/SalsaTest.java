package br.ba.ed.conceicao.rest.test;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;

import br.ba.ed.conceicao.rest.core.BaseTest;
import br.ba.ed.conceicao.rest.core.User;

public class SalsaTest extends BaseTest{
	@Test
	public void DeveAcessarApiSemToken() {
		given()
		.when()
		   .get("/character/2")
		.then()
		 .statusCode(200)
		;
	}
	
	@Test
	public void deveLocalizarPersonagemeEspecie() {
		given()
		.when()
		   .get("/character/3")
		.then()
		 .statusCode(200)
		 .body("id", Matchers.is(3))
		 .body("name", Matchers.containsString("Summer Smith"))
		 .body("species", Matchers.containsString("Human"))
		;
	}
	
	@Test
	public void deveVerificarListaDeLocalizacao() {
	
		  given()
		  .when()
		     .get("/location/")
		  .then()
		     .statusCode(200)
		     .body("info.pages", Matchers.is(7))
		     .body("results.type.findAll{it.startsWith('Planet')}", Matchers.hasItems("Planet"))
		     .body("results.type.findAll{it.startsWith('Planet')}", Matchers.hasSize(12))
		;	
	}
	
	@Test
	public void deveVerificarSeUsuarioéInvalido() {
		  given()
		  .when()
		     .get("https://reqres.in/api/usuarios/23")
		  .then()
		     .statusCode(404)
		;
	}
	
	@Test
	public void deveVerificarSeUsuarioéCriado() {	
		Map<String, String> login =  new HashMap<>();
		login.put("email", "edinea@conceicao");
		login.put("senha", "555555");
		
		
		 given()
			 .body(login)
		  .when()
		     .get("https://seubarriga.wcaquino.me/login")
		  .then()
		     .statusCode(200)
	      .body("id", Matchers.is(Matchers.notNullValue())) ;

	    
	}

		 @Test
			public void deveVerificarUsuarioDeserializado() { 
			 User user = new User("Edinéa", 35);
			 
			
			    given()
					 .body(user)
			    .when()
			            
					    .post("https://restapi.wcaquino.me/users")
				.then()
					    .log().all()
					    .statusCode(201)
					    .extract().body().as(User.class)
					    ;
			   System.out.println("nome" + user.getName());
			   System.out.println("age" + user.getAge());
			   
			   user.setName("Joaquina Pereira");
			   user.setAge(36);
			   user.setSalary(6800.00);
			   
			   System.out.println("nome" + user.getName());
			   System.out.println("age" + user.getAge());
			   System.out.println("age" + user.getSalary());
			   
			   
			   
			   ;
				    }

		
		}

		
            
			 
			 


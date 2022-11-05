// JavaScript Document
// JavaScript Document
var cant=0;
var doctor;
var doctores=[];
var usuario={
	idUsuario:0,
	usuario:"",
	contrasena:"",
	rol:0,
	estado:""
};

var url="http://localhost:8080/ProyectoInge/api";

var registro={
    nombre:"",
    coordenadas:"",
    correo:"",
    sitioWeb:"",
	direccion:"",
    descripcion:"",
    telefono1:"",
	telefono2:"",
    urlFacebook:"",
    urlInstagram:"",
	urlTwitter:"",
	urlWhatsapp:"",
};

function validar(){
	if(document.getElementById("nombre").value==""){
		return false;
	}
	if(document.getElementById("coordenadas").value==""){
		return false;
	}
	if(document.getElementById("correo").value==""){
		return false;
	}
	if(document.getElementById("direccion").value==""){
		return false;
	}
	if(document.getElementById("telefono1").value==""){
		return false;
	}
	if(document.getElementById("telefono2").value==""){
		return false;
	}
	if(document.getElementById("descripcion").value==""){
		return false;
	}
	return true;
}

function enviar(){
    if(!validar()){
		alert();
		return
	}
	registro.nombre=document.getElementById("nombre").value;
	registro.coordenadas=document.getElementById("coordenadas").value;
	registro.correo=document.getElementById("correo").value;  
	registro.sitioWeb=document.getElementById("sitioWeb").value;
	registro.direccion=document.getElementById("direccion").value;  
	registro.descripcion=document.getElementById("descripcion").value;  
	registro.telefono1=document.getElementById("telefono1").value;
	registro.telefono2=document.getElementById("telefono2").value;
	registro.urlFacebook=document.getElementById("urlFacebook").value;  
	registro.urlInstagram=document.getElementById("urlInstagram").value;
	registro.urlTwitter=document.getElementById("urlTwitter").value;  
	registro.urlWhatsapp=document.getElementById("urlWhatsapp").value;  
	  
	document.location="../registroDirectorio/confirmation.html";
	  
    const request = new Request(url+'/login', 
            {method: 'POST', 
                headers: { 'Content-Type': 'application/json'},
                body: JSON.stringify(registro)});
    (async ()=>{
        try{
            const response = await fetch(request);
            if (!response.ok) {console.log("error");return;}
            else{
				document.location="../registroDirectorio/confirmation.html";
            }
        }
        catch(e){
            
        }        
    })();    
  } 

function alert(){
	var div=document.getElementById("alert");
	div.style.display="block";
	// Get all elements with class="closebtn"
	//var close = document.getElementsByClassName("closebtn");
	//var i;
	//setTimeout(function(){ div.style.display = "none"; }, 2000);
	empty();
  // When someone clicks on a close button
  /*close[i].onclick = function(){

    // Get the parent of <span class="closebtn"> (<div class="alert">)
    var div = this.parentElement;

    // Set the opacity of div to 0 (transparent)
    div.style.opacity = "0";

    // Hide the div after 600ms (the same amount of milliseconds it takes to fade out)
    setTimeout(function(){ div.style.display = "none"; }, 600);
  }*/
}

function empty(){
	inputs=document.getElementsByClassName("ob");
	
	for (var i = 0; i < inputs.length; i++) {
		if(inputs[i].value==""){
			inputs[i].style.border="groove";
  			inputs[i].style.borderColor="red";
		}
	}
	
	setTimeout(function(){ 
		for (var i = 0; i < inputs.length; i++) {
			if(inputs[i].value==""){
				inputs[i].style.border="thin";
			}
		}
	}, 2000);
}

function cancelar(){
	
}

function obtenerUsuario(){
	
	const request = new Request(backend+'/usuario', {method: 'GET', headers: { }});
    (async ()=>{
        try{
            const response = await fetch(request);
            if (!response.ok) {
				console.log("error");
				return;
			}
			else{// si la respuesta es correcta
            	usuario = await response.json();
			}
        }
        catch(e){
            //errorMessage(NET_ERR,$("#buscarDiv #errorDiv"));
        }         
    })();    
	 
}

function renderUser(){
	var username=document.getElementById("username");
	username.innerHTML=usuario.usuario;
}

function loaded(){
	document.getElementById("enviar").addEventListener("click",enviar);
	document.getElementById("cancelar").addEventListener("click",cancelar);
	//obtenerUsuario();
	usuario.usuario="208260483";
	renderUser();
}  


document.addEventListener("DOMContentLoaded",loaded); 

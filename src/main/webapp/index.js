var cant=0;
var doctor;
var doctores=[];
var url="http://localhost:8080/api";

var usuario={
    id:1,
    usuario:"111",
    contrasena:"111",
    rol:2,
    estado:"pendiente"
};

function isEmpty(val){
    return (val === undefined || val == null || val.length <= 0) ? true : false;
}

  function login(){
    var user=document.getElementById("email").value;
    var pass=document.getElementById("password").value;
    var usuario={
    id:0,
    usuario:user,
    contrasena:pass,
    rol:0,
    estado:""};

    const request = new Request(url+'/login', 
            {method: 'POST', 
                headers: { 'Content-Type': 'application/json'},
                body: JSON.stringify(usuario)});
    (async ()=>{
        try{
            const response = await fetch(request);
            usuario = await response.json();
            if (!response.ok) {
                 console.log("error de respuesta");
                //document.location="presentation/espera.html";
                //return;
            }
            else{
                localStorage.setItem('user', JSON.stringify(usuario));
                document.location="principal/index.html";
            }
        }
        catch(e){
            console.log("cambio")
            console.log("Usuario no existe");
        }        
    })();    
  } 
  
function loaded(event){	
    document.getElementById("loginButton").addEventListener("click",login);
    //document.getElementById("bRegister").addEventListener("click",register);
}

 document.addEventListener("DOMContentLoaded",loaded); 
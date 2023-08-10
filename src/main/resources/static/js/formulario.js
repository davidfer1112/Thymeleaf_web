//funcion de verificacion caracteres nombre

console.log("hola como estas el dia de hoy, yo muy bien bb")

function verificarCaracteres(entrada) {

    let tipodato = entrada.name;
    let tamanio = entrada.value.length;
    let menerror;

    switch (tipodato) {

        case "nombre":

            menerror = document.getElementById("errorNombre");

            if (tamanio > 50) {
                entrada.style.borderColor = "red";
                menerror.innerHTML = "El nombre debe tener menos de 50 caracteres";
            }
            else {
                entrada.style.borderColor = "black";
                menerror.innerHTML = "";
            }
            break;

        case "apellido":

            menerror = document.getElementById("errorApellido");

            if (tamanio > 50) {
                entrada.style.borderColor = "red";
                menerror.innerHTML = "El apellido debe tener menos de 50 caracteres";
            }
            else {
                entrada.style.borderColor = "black";
                menerror.innerHTML = "";
            }
            break;
    }
}



// verificacion de edad
function verificarEdad(entrada) {

    let edad = entrada.value;
    let menerror = document.getElementById("errorEdad");

    if(esEntero(edad) == false){
        entrada.style.borderColor = "red";
        menerror.innerHTML = "La edad debe ser un número entero.";
    }
    else if (edad > 100) {
        entrada.style.borderColor = "red";
        menerror.innerHTML = "La edad no puede ser mayor a 100";
    }
    else {
        menerror.innerHTML = "";
        entrada.style.borderColor = "black";
    }

}

function esEntero(numero) {
    if (numero % 1 == 0) {
        return true;
    }
    else {
        return false;
    }
}
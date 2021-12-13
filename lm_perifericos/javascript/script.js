/**nav*/
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}

/**funcion aclarar,oscurecer */

function aclarar(opac) {
  document.getElementById('img_script').style.opacity= opac;
}

function aclarar1(opac) {
  document.getElementById('img_script1').style.opacity= opac;
}
function fun1() {
    var a = document.calculatorForm.t1.value; // form -> t1 -> value
    var b = document.calculatorForm.t2.value;
    if(a == "") {
        var x = document.getElementById("t1Span");
        x.innerHTML = 'Enter 1st number'
        x.style.color = 'red';
        return false;
    }
    if(b == "") {
        var y = document.getElementById("t2Span");
        y.innerHTML = "Enter 2nd number";
        y.style.color = 'red';
        return false;
    }
    if(a != "" || b != "") {
        fun2(parseInt(a), parseInt(b));
        return true;
    }   
}
function fun2(x, y) {
    var z = x + y;
    alert("fun2() is called: "+z);
}
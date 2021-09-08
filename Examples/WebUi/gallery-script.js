function rotate(ev) {
    var ele = ev.target;
    if(ele.tagName == "IMG") {
        document.getElementById("mainImage").src = ele.src;
    }
}
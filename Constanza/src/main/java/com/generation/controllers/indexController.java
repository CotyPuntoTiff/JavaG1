@RequestMapping("/usuario")
public String usuario(){
    return "estamos en la url usuario"
}

@RequestMapping("/usuario/inscrito")
public String inscrito(){
    return "estamos en la url usuario/inscrito"
}

@RequestMapping(value = "/proveedor/registrado", method = RequestMetod.GET)
public String proveedor(){
    return "ruta de proveedor"
}
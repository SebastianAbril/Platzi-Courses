letras = ["q","w","e","x","r","y"]
letras.size
letras[-3]
letras[-1]
letras.methods
letras.methods.size

[1,2,3,4,5,6].map { |x| x*2 }
[1,2,3,4,5,6].select {|x| x.odd?}
[1,2,3,4,5,6].min
[1,2,3,4,5,6].max
[1,2.5,"string", :symbol, []]

#La habilidad de organizar un arreglo.


letras_ordenadas =  letras.sort
letras_ordenadas =  letras.sort!
letras = ["q","w","e","x","r","y"]
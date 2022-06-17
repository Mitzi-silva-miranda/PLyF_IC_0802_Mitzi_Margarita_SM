heroe(spiderman).  
heroe(iron_man). 
villano(duende_verde,spiderman).

enemigos(X,Y):-heroe(X),villano(X,Y).   
	         




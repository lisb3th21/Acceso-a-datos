def torre(tamano, inicio, des, aux):
    if tamano>0:
        torre(tamano-1, inicio, aux, des)
        
        print("desde "+inicio+" hasta "+des)
        torre(tamano-1, aux, des, inicio)
        torre(tamano-1, des, aux, inicio)
        print("desde "+inicio+" hasta "+des)



torre(3,"A","B","C")
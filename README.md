INFORMATICA 14/02
Scheduling=processo che frammenta un problema e le risorse, suddivide i processi in task 
Processo=insieme di task, ha uno spazio dedicato in memoria che accede alle risorse
Il passaggio da un task ad un altro avviene quando viene terminato il tempo a disposizione 
Lo scheduler
Task=thread
Thread= unità più piccola all’interno di un processo, condivide la ram del processo madre
La classe thread è pericolosa, non è efficiente
Per creare un thread si estende la classe thread e si fa l’override del metodo run()
start() è il metodo che fa partire il metodo run() con la differenza che start fa una serie di operazioni prima di chiamare run(). 

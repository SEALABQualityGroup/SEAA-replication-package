# MAGICDRAW
La licenza di MagicDraw 18.0 si trova nella cartella model/magicdraw (file MagicDraw_18_0_Enterprise_Evaluation_key). L'altra licenza (file MagicDraw_CAMEO_SIMULATION_TOOLKIT_18_0_Evaluation_key) è per il plugin CAMEO SIMULATION TOOLKIT, che aggiunge funzionalitŕ simulative ad un insieme ristretto di UML. Quest'ultima licenza, cosě come il plugin CST, non serve ai fini di questo progetto, ma per sicurezza la inserisco perché MagicDraw potrebbe richiederla.

# RUN CONFIGURATION 
## (dopo aver importato il progetto in Eclipse)
- Creare una nuova run configuration
- selezionare il file evl (vedi 1-source.png)
- selezionare l'UML model (vedi 2-model)
- cancellare tutti i metamodelli che non rientrano nell'elenco in 2-UML-model-details.png, onde evitare di incorrere nell'eccezione che si vede sullo sfondo di quest'ultima immagine

# RUN
Una volta runnato il file evl sul modello di esempio (il cui file .mdzip rappresenta il progetto magicdraw), alcuni Blob e CPS verranno rilevati (parzialmente, in quanto non ho completato la definizione delle loro parti check). Cliccando col destro su uno di questi antipattern, due azioni di refactoring saranno disponibili. Per il momento, eseguirne e stoppare il run per rendere effettive le modifiche.

# CONVENZIONI DI MODELLAZIONE
## (3 views: _Static_, _Dynamic_, _Deployment_ )
- **STATIC**: contiene Components aventi Operations, Usages ed InterfaceRealizations. dunque vi sono Interfaces, che a loro volta contengono Operations.
- **DYNAMIC**: contiene UseCases aventi Interactions che a loro volta contengono un qualsiasi costrutto UML, conformemente al metamodello UML stesso (es. Fragments, Messages). N.B.: questa parte č "rognosa", in quanto per ogni Message non esiste solo un elemento Message, ma anche le corrispondenti MessageOccurrenceSpecifications. Praticamente, considera che quando ti servirŕ un Message, sarai di fatto costretto a guardare le MessageOccurrenceSpecifications. 
- **DEPLOYMENT**: contiene Nodes su cui sono deployati Artifacts che manifestano Components. Esiste dunque questo "livello intermedio" che passa per gli Artifacts (vedi evl d'esempio). 

# PAPERS ALLEGATI
- **Chap2-ArcelliPhDThesis (PerfAntipatterns)**: è il secondo capitolo della mia tesi, in cui descrivo alcuni antipattern di riferimento. Fra questi, ne dobbiamo "pescare" alcuni (magari tutti :-) ) su cui lavorare
- **Experimenting the Influence of...**: qui fondamentalmente si trova il modello UML d'esempio, la detection di alcuni antipattern, ed alcuni refactoring

# NOTE SPARSE
- Quando si esegue un evl, un sintomo che qualcosa va storto č dato dal fatto che il modello uml su cui l'evl opera si svuota completamente. Si consiglia dunque di tenere sempre da parte una copia del modello iniziale
- Il debug non esiste, se non "manualmente" attraverso "UserInput.inform(...)"
- Vettori domanda: nel modello di esempio, le componenti BooksCatalog e MoviesCatalog hanno tre Operation ciascuna, stereotipate con <<GaAcqStep>> che consente di specificare resUnits (e volendo acqRes). Questo č un approccio "semplicistico" e magari lo raffineremo successivamente.
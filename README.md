Patron de Conception l’Adaptateur
Le patron Adaptateur existe pour résoudre les problèmes d’incompatibilité entre des interfaces. Il agit comme un intermédiaire (ou un pont) entre deux classes qui ne peuvent pas collaborer directement, en convertissant l’interface d’une classe en une autre interface attendue par le client.
Exemple d’utilisation dans les librairies Java et autres :
Dans les librairies Python, Java et C#, le patron Adaptateur est souvent utilisé dans les systèmes basés sur du code hérité. Il permet de faire fonctionner du code ancien avec des classes modernes, sans avoir à modifier le code existant.

Description du Concept :
Un adaptateur enveloppe un objet afin de cacher la complexité de la conversion qu’il réalise discrètement en arrière-plan.
L’objet ainsi encapsulé ignore totalement le travail effectué par l’adaptateur.
Par exemple, on peut envelopper un objet qui manipule des valeurs en mètres et en kilomètres à l’aide d’un adaptateur chargé de convertir automatiquement toutes les données en unités impériales telles que les pieds ou les milles. Mais le rôle des adaptateurs ne se limite pas aux simples conversions de formats, ils permettent aussi à des interfaces différentes de collaborer sans conflit.

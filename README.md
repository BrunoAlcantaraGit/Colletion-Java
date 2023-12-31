Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.
Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.
O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

![image](https://github.com/BrunoAlcantaraGit/Colletion-Java/assets/120646838/de27e9d9-8b62-4c6b-9ab4-45f0f949f95e)


Hierarchy of Collection Framework in Java

Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
Embora a interface Map não ser filha direta da interface Collection ela também é considerada uma coleção devido a sua função.
List interface hierarchy Java
Method Sumary Collection Interface

![image](https://github.com/BrunoAlcantaraGit/Colletion-Java/assets/120646838/1f567ff5-3530-47ed-b7a3-e66827f05bea)


Referências:

[1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

[2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

[3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

[4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

Se você preferir usar o protocolo SSH para comunicação com o repositório, siga as etapas abaixo:

Abra o terminal ou prompt de comando.

Navegue até o diretório do projeto.

Execute o seguinte comando para mudar a URL remota para SSH:

git remote set-url origin git@github.com:cami-la/collections-java-api-2023.git

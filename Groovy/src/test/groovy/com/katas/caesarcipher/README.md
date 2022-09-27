# Spécifications du produit Caesar Cipher

Dans l'optique de limiter le risque légal, nous avons besoin d'une solution pour chiffrer les identifiants de nos clients avant de les exposer.
Pour ce faire, nous souhaitons utiliser le chiffrement de César ! 

Principe du chiffrement de César: Décalage de chaque code charactère d'un entier 

Exemple: 
- Pour un décalage de 1 : ACF90T -> BDG90U

## Précisions

- Un id client fait 32 caractères (ex: FF90E16AAEBACA093543299F8F26FCF1)
- On s'attend des lettres de l'alphabet, majuscule ou minuscule, et des chiffres
- On ne chiffre que les lettres
- Données pourries => aucune garantie de qualité pour l'identifiant
- Charset non garanti
- Le décalage est un paramètre de la méthode de chiffrement
- input.uppercase() = cipher(cipher(input,1)-1) 

<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="inscription">
            <fieldset>
                <legend>Inscription Etudiant</legend>
               
                <label for="email"> Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" />
                <br />
                
                <label for="email"> Prénom <span class="requis">*</span></label>
                <input type="text" id="prenom" name="prenom" />
                <br />
                
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" />
                <br />

                <label for="email"> Adresse <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" />
                <br />
                
                <label for="email"> Numero de téléphone  <span class="requis">*</span></label>
                <input type="text" id="telephone" name="telephone" />
                <br />
                
                <label for="email"> Date de naissance <span class="requis">*</span></label>
                <input type="date" id="date" name="date" />
                <br />

                <input type="submit" value="Inscription" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>
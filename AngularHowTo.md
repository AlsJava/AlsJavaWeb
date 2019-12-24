Con este How to minimo iniciamos un proyecto en blanco para publicar.

# Configurar Angular
 - Instalar Angular (npm -g install @angular/cli)
 - Creamos el projecto (ng new AlsJava --routing=false --style=css)
 - Copiamos el contenido de esa carpeta al git y luego trabajamos normalmente
 - Inicio el proyecto (ng build --prod --output-path docs --base-href https://alsjava.com/)
 - Luego solo ejecutamos (ng build --prod)

# Notas
Si no se usan dominio custom le hacemos esto
 - Inicio el proyecto (ng build --prod --output-path docs --base-href https://alsjava.github.io/AlsJavaWeb/)

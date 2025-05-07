# Usar a imagem base do Nginx
FROM nginx:alpine

# Copiar todos os arquivos do diretório 'front' para o diretório padrão do Nginx
COPY ./ /usr/share/nginx/html

# Expor a porta 80 (usada pelo Nginx)
EXPOSE 80

# Rodar o Nginx em primeiro plano
CMD ["nginx", "-g", "daemon off;"]

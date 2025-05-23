# Usar a imagem base do Nginx
FROM nginx:alpine

# Copiar todos os arquivos da pasta 'html' para o diretório padrão do Nginx
COPY ./html /usr/share/nginx/html
COPY ./css /usr/share/nginx/html/css  

# Expor a porta 80 (usada pelo Nginx)
EXPOSE 80

# Rodar o Nginx em primeiro plano
CMD ["nginx", "-g", "daemon off;"]

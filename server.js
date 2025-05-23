const express = require('express');
const path = require('path');
const { createProxyMiddleware } = require('http-proxy-middleware');

const app = express();

// Configuração do proxy para a API
app.use('/api', createProxyMiddleware({
    target: 'http://localhost:8080',  // URL do seu backend
    changeOrigin: true,              // Altera a origem para a do backend
    pathRewrite: {
        '^/api': '',  // Remove '/api' da URL ao redirecionar
    }
}));

// Serve arquivos estáticos (HTML, CSS, JS)
app.use(express.static(path.join(__dirname, 'public')));

// Inicia o servidor na porta 80
app.listen(80, () => {
    console.log('Servidor de desenvolvimento rodando na porta 80');
});

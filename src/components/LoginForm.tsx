
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import { BlurCard } from "@/components/ui/blur-card";
import { useToast } from "@/hooks/use-toast";

export function LoginForm() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [code, setCode] = useState("");
  const [name, setName] = useState("");
  const [studentId, setStudentId] = useState("");
  const [isLoading, setIsLoading] = useState(false);
  const navigate = useNavigate();
  const { toast } = useToast();

  const handleSignIn = (e: React.FormEvent) => {
    e.preventDefault();
    setIsLoading(true);
    
    // Simulate API call
    setTimeout(() => {
      setIsLoading(false);
      
      if (email && password) {
        toast({
          title: "Login realizado com sucesso!",
          description: "Bem-vindo ao Business Strategy.",
        });
        navigate("/dashboard");
      } else {
        toast({
          title: "Erro de login",
          description: "Por favor, verifique seu e-mail e senha.",
          variant: "destructive",
        });
      }
    }, 1000);
  };

  const handleSignUp = (e: React.FormEvent) => {
    e.preventDefault();
    setIsLoading(true);
    
    // Simulate API call
    setTimeout(() => {
      setIsLoading(false);
      
      if (name && email && studentId) {
        toast({
          title: "Cadastro realizado com sucesso!",
          description: "Verifique seu e-mail para confirmar sua conta.",
        });
      } else {
        toast({
          title: "Erro no cadastro",
          description: "Por favor, preencha todos os campos obrigatórios.",
          variant: "destructive",
        });
      }
    }, 1000);
  };

  const handleSimulationAccess = (e: React.FormEvent) => {
    e.preventDefault();
    setIsLoading(true);
    
    // Simulate API call
    setTimeout(() => {
      setIsLoading(false);
      
      if (code) {
        toast({
          title: "Código de acesso válido!",
          description: "Entrando na simulação...",
        });
        navigate("/dashboard");
      } else {
        toast({
          title: "Código inválido",
          description: "Por favor, verifique o código de acesso da simulação.",
          variant: "destructive",
        });
      }
    }, 1000);
  };

  return (
    <BlurCard className="w-full max-w-md">
      <Tabs defaultValue="signin" className="w-full">
        <TabsList className="grid w-full grid-cols-3 mb-6">
          <TabsTrigger value="signin">Entrar</TabsTrigger>
          <TabsTrigger value="signup">Cadastrar</TabsTrigger>
          <TabsTrigger value="code">Código de Acesso</TabsTrigger>
        </TabsList>
        
        <TabsContent value="signin" className="space-y-4">
          <form onSubmit={handleSignIn} className="space-y-4">
            <div className="space-y-2">
              <Label htmlFor="email">E-mail</Label>
              <Input
                id="email"
                type="email"
                placeholder="seu.email@instituicao.edu.br"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                required
              />
            </div>
            <div className="space-y-2">
              <div className="flex items-center justify-between">
                <Label htmlFor="password">Senha</Label>
                <a
                  href="#"
                  className="text-xs text-business-blue hover:underline"
                >
                  Esqueceu a senha?
                </a>
              </div>
              <Input
                id="password"
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
              />
            </div>
            <Button 
              type="submit" 
              className="w-full bg-business-navy hover:bg-business-navy/90 button-gloss"
              disabled={isLoading}
            >
              {isLoading ? "Entrando..." : "Entrar"}
            </Button>
          </form>
          
          <div className="relative my-6">
            <div className="absolute inset-0 flex items-center">
              <div className="w-full border-t border-gray-300"></div>
            </div>
            <div className="relative flex justify-center text-xs uppercase">
              <span className="bg-white dark:bg-gray-900 px-2 text-muted-foreground">
                Ou continue com
              </span>
            </div>
          </div>
          
          <Button variant="outline" className="w-full" onClick={() => {
            toast({
              title: "Google Workspace",
              description: "Integração com Google Workspace ainda não configurada.",
            });
          }}>
            <svg className="w-5 h-5 mr-2" viewBox="0 0 24 24">
              <path
                d="M22.56 12.25c0-.78-.07-1.53-.2-2.25H12v4.26h5.92c-.26 1.37-1.04 2.53-2.21 3.31v2.77h3.57c2.08-1.92 3.28-4.74 3.28-8.09z"
                fill="#4285F4"
              />
              <path
                d="M12 23c2.97 0 5.46-.98 7.28-2.66l-3.57-2.77c-.98.66-2.23 1.06-3.71 1.06-2.86 0-5.29-1.93-6.16-4.53H2.18v2.84C3.99 20.53 7.7 23 12 23z"
                fill="#34A853"
              />
              <path
                d="M5.84 14.09c-.22-.66-.35-1.36-.35-2.09s.13-1.43.35-2.09V7.07H2.18C1.43 8.55 1 10.22 1 12s.43 3.45 1.18 4.93l2.85-2.22.81-.62z"
                fill="#FBBC05"
              />
              <path
                d="M12 5.38c1.62 0 3.06.56 4.21 1.64l3.15-3.15C17.45 2.09 14.97 1 12 1 7.7 1 3.99 3.47 2.18 7.07l3.66 2.84c.87-2.6 3.3-4.53 6.16-4.53z"
                fill="#EA4335"
              />
            </svg>
            Google Workspace
          </Button>
        </TabsContent>
        
        <TabsContent value="signup" className="space-y-4">
          <form onSubmit={handleSignUp} className="space-y-4">
            <div className="space-y-2">
              <Label htmlFor="name">Nome Completo</Label>
              <Input
                id="name"
                type="text"
                placeholder="Seu nome completo"
                value={name}
                onChange={(e) => setName(e.target.value)}
                required
              />
            </div>
            <div className="space-y-2">
              <Label htmlFor="studentId">Matrícula</Label>
              <Input
                id="studentId"
                type="text"
                placeholder="Número de matrícula"
                value={studentId}
                onChange={(e) => setStudentId(e.target.value)}
                required
              />
            </div>
            <div className="space-y-2">
              <Label htmlFor="signup-email">E-mail Institucional</Label>
              <Input
                id="signup-email"
                type="email"
                placeholder="seu.email@instituicao.edu.br"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                required
              />
            </div>
            <Button 
              type="submit" 
              className="w-full bg-business-teal hover:bg-business-teal/90 button-gloss"
              disabled={isLoading}
            >
              {isLoading ? "Cadastrando..." : "Cadastrar"}
            </Button>
          </form>
        </TabsContent>
        
        <TabsContent value="code" className="space-y-4">
          <form onSubmit={handleSimulationAccess} className="space-y-4">
            <div className="space-y-2">
              <Label htmlFor="access-code">Código de Acesso</Label>
              <Input
                id="access-code"
                type="text"
                placeholder="Digite o código da simulação"
                value={code}
                onChange={(e) => setCode(e.target.value)}
                required
                className="text-center text-lg tracking-wider"
              />
              <p className="text-xs text-muted-foreground text-center">
                Insira o código fornecido pelo seu professor
              </p>
            </div>
            <Button 
              type="submit" 
              className="w-full bg-business-blue hover:bg-business-blue/90 button-gloss"
              disabled={isLoading}
            >
              {isLoading ? "Verificando..." : "Acessar Simulação"}
            </Button>
          </form>
        </TabsContent>
      </Tabs>
    </BlurCard>
  );
}

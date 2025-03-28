
import React from "react";
import { Logo } from "@/components/Logo";
import { LoginForm } from "@/components/LoginForm";
import { AnimatedBackground } from "@/components/ui/animated-background";
import { PageTransition } from "@/components/ui/page-transition";
import { BlurCard } from "@/components/ui/blur-card";

const Index = () => {
  return (
    <AnimatedBackground pattern="dots" className="min-h-screen">
      <PageTransition animationType="fade" className="min-h-screen flex flex-col">
        <div className="flex flex-1 items-center justify-center py-12 px-4 sm:px-6 lg:px-8">
          <div className="w-full max-w-5xl">
            <div className="grid grid-cols-1 lg:grid-cols-2 gap-8 items-center">
              <div className="flex flex-col space-y-8 order-2 lg:order-1">
                <div className="space-y-6 text-center lg:text-left">
                  <Logo size="lg" className="mx-auto lg:mx-0" />
                  
                  <div className="space-y-2">
                    <h1 className="text-4xl md:text-5xl font-bold tracking-tight text-business-navy dark:text-white">
                      Simulação Empresarial<br /> 
                      <span className="text-gradient">Interativa e Prática</span>
                    </h1>
                    <p className="text-lg text-business-gray/80">
                      Aprenda conceitos de administração de empresas de forma interativa e prática, 
                      através de simulações, desafios e rankings.
                    </p>
                  </div>
                </div>
                
                <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
                  <BlurCard className="text-center">
                    <div className="mb-2 bg-business-navy/10 w-12 h-12 mx-auto rounded-full flex items-center justify-center">
                      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" className="text-business-navy">
                        <path d="M20 16V7a2 2 0 0 0-2-2H6a2 2 0 0 0-2 2v9m16 0H4m16 0 1.28 2.55a1 1 0 0 1-.9 1.45H3.62a1 1 0 0 1-.9-1.45L4 16"></path>
                        <path d="M8 7h.01M12 7h.01M16 7h.01"></path>
                      </svg>
                    </div>
                    <h3 className="font-medium">Simulação Empresarial</h3>
                    <p className="text-sm text-muted-foreground mt-1">Tome decisões reais e veja os resultados</p>
                  </BlurCard>
                  
                  <BlurCard className="text-center">
                    <div className="mb-2 bg-business-teal/10 w-12 h-12 mx-auto rounded-full flex items-center justify-center">
                      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" className="text-business-teal">
                        <path d="M12 2v20M17 5H9.5a3.5 3.5 0 0 0 0 7h5a3.5 3.5 0 0 1 0 7H6"></path>
                      </svg>
                    </div>
                    <h3 className="font-medium">Gestão Financeira</h3>
                    <p className="text-sm text-muted-foreground mt-1">Aprenda a administrar recursos e investimentos</p>
                  </BlurCard>
                  
                  <BlurCard className="text-center">
                    <div className="mb-2 bg-business-blue/10 w-12 h-12 mx-auto rounded-full flex items-center justify-center">
                      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" className="text-business-blue">
                        <path d="m7.5 4.27 9 5.15"></path>
                        <path d="M21 8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16Z"></path>
                        <path d="m3.3 7 8.7 5 8.7-5"></path>
                        <path d="M12 12v10"></path>
                      </svg>
                    </div>
                    <h3 className="font-medium">Tomada de Decisões</h3>
                    <p className="text-sm text-muted-foreground mt-1">Desenvolva estratégias e veja os resultados</p>
                  </BlurCard>
                </div>
              </div>

              <div className="order-1 lg:order-2 flex justify-center">
                <LoginForm />
              </div>
            </div>
          </div>
        </div>
        
        <footer className="w-full py-4 text-center text-sm text-muted-foreground">
          &copy; {new Date().getFullYear()} Business Strategy | Todos os direitos reservados
        </footer>
      </PageTransition>
    </AnimatedBackground>
  );
};

export default Index;


import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Logo } from "@/components/Logo";
import { MetricCard } from "@/components/dashboard/MetricCard";
import { SideMenu } from "@/components/dashboard/SideMenu";
import { DashboardHeader } from "@/components/dashboard/DashboardHeader";
import { FinancialChart } from "@/components/dashboard/FinancialChart";
import { ExpensesPieChart } from "@/components/dashboard/ExpensesPieChart";
import { Notifications } from "@/components/dashboard/Notifications";
import { Button } from "@/components/ui/button";
import { PageTransition } from "@/components/ui/page-transition";
import { BlurCard } from "@/components/ui/blur-card";
import { ChevronRight } from "lucide-react";

const Dashboard = () => {
  const navigate = useNavigate();
  const [currentView, setCurrentView] = useState("dashboard");
  
  // Dados de exemplo para as métricas
  const mockData = {
    companyName: "TechSolutions Corp.",
    profit: "R$ 87.450,00",
    profitTrend: "+12,3%",
    marketShare: "23,5%",
    marketShareTrend: "+2,1%",
    customerSatisfaction: "87/100",
    customerSatisfactionTrend: "+5",
    notifications: [
      {
        id: 1,
        type: "warning",
        message: "Aumento de 10% no custo da matéria-prima previsto para o próximo ciclo!",
        time: "2h atrás"
      },
      {
        id: 2,
        type: "info",
        message: "Nova rodada de decisões será aberta em 3 dias.",
        time: "5h atrás"
      },
      {
        id: 3,
        type: "success",
        message: "Sua empresa conquistou 2,1% de participação de mercado adicional!",
        time: "1d atrás"
      }
    ]
  };

  return (
    <PageTransition animationType="fade-up" className="min-h-screen bg-gray-50 dark:bg-business-navy/95">
      <div className="flex min-h-screen">
        {/* Menu Lateral */}
        <SideMenu 
          currentView={currentView} 
          setCurrentView={setCurrentView} 
        />
        
        {/* Conteúdo Principal */}
        <div className="flex-1 flex flex-col">
          <DashboardHeader companyName={mockData.companyName} />
          
          <main className="flex-1 px-6 py-8 overflow-auto">
            <div className="max-w-7xl mx-auto">
              <div className="flex flex-col gap-8">
                {/* Seção Superior - Métricas-Chave */}
                <section>
                  <h2 className="text-2xl font-bold mb-4 text-business-navy dark:text-white">
                    Métricas Principais
                  </h2>
                  
                  <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
                    <MetricCard 
                      title="Lucro Líquido" 
                      value={mockData.profit} 
                      trend={mockData.profitTrend} 
                      icon="trending-up"
                      color="green"
                    />
                    
                    <MetricCard 
                      title="Participação de Mercado" 
                      value={mockData.marketShare} 
                      trend={mockData.marketShareTrend} 
                      icon="pie-chart"
                      color="blue"
                    />
                    
                    <MetricCard 
                      title="Satisfação dos Clientes" 
                      value={mockData.customerSatisfaction} 
                      trend={mockData.customerSatisfactionTrend} 
                      icon="heart"
                      color="pink"
                    />
                  </div>
                </section>
                
                {/* Seção do Meio - Gráficos */}
                <section className="grid grid-cols-1 lg:grid-cols-3 gap-6">
                  <BlurCard className="lg:col-span-2">
                    <div className="flex justify-between items-center mb-4">
                      <h3 className="font-bold text-lg text-business-navy dark:text-white">
                        Evolução Financeira
                      </h3>
                      <Button variant="ghost" size="sm">
                        Ver detalhes <ChevronRight className="ml-1 h-4 w-4" />
                      </Button>
                    </div>
                    <FinancialChart />
                  </BlurCard>
                  
                  <BlurCard>
                    <div className="flex justify-between items-center mb-4">
                      <h3 className="font-bold text-lg text-business-navy dark:text-white">
                        Distribuição de Gastos
                      </h3>
                      <Button variant="ghost" size="sm">
                        Ver detalhes <ChevronRight className="ml-1 h-4 w-4" />
                      </Button>
                    </div>
                    <ExpensesPieChart />
                  </BlurCard>
                </section>
                
                {/* Seção Inferior - Notificações */}
                <section>
                  <BlurCard>
                    <h3 className="font-bold text-lg text-business-navy dark:text-white mb-4">
                      Notificações e Alertas
                    </h3>
                    <Notifications notifications={mockData.notifications} />
                  </BlurCard>
                </section>
              </div>
            </div>
          </main>
        </div>
      </div>
    </PageTransition>
  );
};

export default Dashboard;

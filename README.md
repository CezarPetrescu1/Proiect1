Prezentare Proiect: Petrescu Cezar-Liviu
Prezentare Generală a Proiectului
Acest proiect se concentrează pe automatizarea testării unei aplicații web de tipul   e-commerce. Scopul principal este de a asigura fiabilitatea și funcționalitatea diferitelor interacțiuni ale utilizatorilor în cadrul aplicației, cum ar fi autentificarea, căutarea produselor, adăugarea articolelor în coș și sortarea listelor de produse.
Caracteristici 
Testarea Automată a Funcționalității de Autentificare: Verifică funcționalitatea formularului de login      pentru a se asigura că utilizatorii se pot autentifica corect.
Testarea Funcționalității de Căutare: Verifică funcționalitatea casetei de căutare pentru a se asigura că utilizatorii pot găsi produsele eficient.
Operațiuni cu Coșul de Cumpărături: Automatizează procesul de adăugare a articolelor în coș și verificarea conținutului coșului.
Validarea Sortării Produselor: Testează caracteristicile de sortare pentru a confirma că produsele sunt sortate corect în funcție de preferințele utilizatorilor.
Interacțiunea cu Elemente UI: Se asigură că elementele clicabile, cum ar fi butoanele și iconițele, răspund corect la interacțiunile utilizatorilor.
Tehnologii Utilizate
Selenium WebDriver: Pentru automatizarea browserului.
TestNG: Ca framework de testare pentru gestionarea cazurilor de testare și generarea rapoartelor.
ExtentReports: Pentru rapoarte de testare detaliate și jurnalizare.
Maven: Pentru gestionarea dependențelor și a build-ului proiectului.
ChromeDriver: Pentru rularea testelor pe browserul Google Chrome.
Structura Codului
Modelul Obiectului de Pagină (POM)
HomePage: Conține metode pentru interacționarea cu elementele de pe pagina principală.
LoginPage: Gestionează interacțiunile legate de procesul de autentificare.
CheckoutPage: Gestionează interacțiunile legate de procesul de finalizare a comenzii.

Teste
HomeTest: Include cazuri de testare pentru verificarea funcționalității de căutare și sortarea produselor.
            LoginTest: Conține cazuri de testare pentru verificarea funcționalității de autentificare.
CheckoutTest: Conține cazuri de testare pentru testarea procesului de finalizare a comenzii.
 Ascultători (Listeners)
ExtentTestNGITestListener: Implementează ascultători TestNG pentru jurnalizarea rezultatelor testelor și generarea ExtentReports.

Concluzie
Acest proiect asigură că aplicația de tipul  e-commerce funcționează fără probleme și îndeplinește așteptările utilizatorilor prin automatizarea funcționalităților și interacțiunilor. Utilizarea Selenium, TestNG și ExtentReports, împreună cu Maven pentru gestionarea dependențelor și ChromeDriver pentru rularea testelor, oferă un framework robust pentru testare cuprinzătoare și raportare detaliată.



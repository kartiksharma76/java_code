package Practicesheet;
import java.util.concurrent.TimeUnit;

public class NewYear2026 {

    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    // Bold colors
    public static final String BOLD_RED = "\u001B[1;31m";
    public static final String BOLD_GREEN = "\u001B[1;32m";
    public static final String BOLD_YELLOW = "\u001B[1;33m";
    public static final String BOLD_BLUE = "\u001B[1;34m";
    public static final String BOLD_PURPLE = "\u001B[1;35m";
    public static final String BOLD_CYAN = "\u001B[1;36m";

    public static void main(String[] args) throws InterruptedException {
        
        clearScreen();
        
        System.out.println("\n\n");
        
        // HAPPY
        System.out.println(BOLD_CYAN);
        printCentered("██╗  ██╗ █████╗ ██████╗ ██████╗ ██╗   ██╗");
        printCentered("██║  ██║██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝");
        printCentered("███████║███████║██████╔╝██████╔╝ ╚████╔╝ ");
        printCentered("██╔══██║██╔══██║██╔═══╝ ██╔═══╝   ╚██╔╝  ");
        printCentered("██║  ██║██║  ██║██║     ██║        ██║   ");
        printCentered("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝        ╚═╝   ");
        System.out.println(RESET);

        Thread.sleep(500);

        // NEW
        System.out.println(BOLD_YELLOW);
        printCentered("███╗   ██╗███████╗██╗    ██╗");
        printCentered("████╗  ██║██╔════╝██║    ██║");
        printCentered("██╔██╗ ██║█████╗  ██║ █╗ ██║");
        printCentered("██║╚██╗██║██╔══╝  ██║███╗██║");
        printCentered("██║ ╚████║███████╗╚███╔███╔╝");
        printCentered("╚═╝  ╚═══╝╚══════╝ ╚══╝╚══╝ ");
        System.out.println(RESET);

        Thread.sleep(500);

        // YEAR
        System.out.println(BOLD_GREEN);
        printCentered("██╗   ██╗███████╗ █████╗ ██████╗ ");
        printCentered("╚██╗ ██╔╝██╔════╝██╔══██╗██╔══██╗");
        printCentered(" ╚████╔╝ █████╗  ███████║██████╔╝");
        printCentered("  ╚██╔╝  ██╔══╝  ██╔══██║██╔══██╗");
        printCentered("   ██║   ███████╗██║  ██║██║  ██║");
        printCentered("   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝");
        System.out.println(RESET);

        Thread.sleep(500);

      /// 2026 - CORRECTED VERSION (2-0-2-6)
        System.out.println(BOLD_RED);
        printCentered("██████╗  ██████╗  ██████╗  ██████╗ ");
        printCentered("╚════██╗██╔═████╗██╔═══██╗██╔════╝ ");
        printCentered(" █████╔╝██║██╔██║ █████╔╝ ███████╗ ");
        printCentered("██╔═══╝ ████╔╝██║██╔═══╝  ██╔═══██╗");
        printCentered("███████╗╚██████╔╝███████╗ ╚██████╔╝");
        printCentered("╚══════╝ ╚═════╝ ╚══════╝  ╚═════╝ ");
        System.out.println(RESET);

        Thread.sleep(800);

        // Developer Quotes Section
        System.out.println("\n\n");
        printSeparator();
        
        System.out.println(BOLD_PURPLE);
        printCentered("🚀  Developer Mindset for 2026  🚀");
        System.out.println(RESET);
        
        printSeparator();
        Thread.sleep(300);

        // Developer Quotes
        String[] quotes = {
            BOLD_CYAN + "💻  Code with purpose, debug with patience, deploy with confidence.",
            BOLD_YELLOW + "⚡  Every line of code is a brick - build a cathedral, not a shack.",
            BOLD_GREEN + "🔧  The best developers aren't those who never fail, but those who never stop learning.",
            BOLD_BLUE + "🎯  Clean code > Clever code. Readability > Complexity.",
            BOLD_PURPLE + "🚀  Ship it. Iterate. Ship again. Repeat until extraordinary."
        };

        for (String quote : quotes) {
            printCentered(quote + RESET);
            Thread.sleep(600);
        }

        printSeparator();
        Thread.sleep(300);

        // Special Developer Quotes
        System.out.println(BOLD_RED + "\n" + getCentered("✨ SPECIAL QUOTES FOR DEVELOPERS ✨") + RESET);
        System.out.println(BOLD_YELLOW + getCentered("(Ctrl+C, Ctrl+V this energy into 2026)") + RESET);
        
        System.out.println("\n" + BOLD_CYAN);
        printCentered("\"First, solve the problem. Then, write the code.\" - John Johnson");
        System.out.println(BOLD_GREEN);
        printCentered("\"The only way to learn a new programming language is by writing programs in it.\" - Dennis Ritchie");
        System.out.println(BOLD_PURPLE);
        printCentered("\"Programming isn't about what you know; it's about what you can figure out.\" - Chris Pine");
        System.out.println(BOLD_BLUE);
        printCentered("\"Make it work, make it right, make it fast.\" - Kent Beck");
        System.out.println(BOLD_YELLOW);
        printCentered("\"Every great developer you know got there by solving problems they were unqualified to solve.\" - Patrick McKenzie");
        System.out.println(RESET);

        printSeparator();
        Thread.sleep(300);

        // My Firm Work Principles
        System.out.println(BOLD_GREEN + "\n" + getCentered("🎯 MY FIRM WORK PRINCIPLES FOR 2026 🎯") + RESET);
        
        String[] principles = {
            CYAN + "✅  Deep Work: 4 hours of focused coding > 8 hours of distraction",
            YELLOW + "✅  Build in Public: Share progress, get feedback, grow faster",
            GREEN + "✅  Ship Weekly: Consistent small wins beat occasional big launches",
            BLUE + "✅  Code Review Culture: Your code is our code, quality is collective",
            PURPLE + "✅  Documentation First: If it's not documented, it doesn't exist",
            RED + "✅  Test Driven: Write tests first, sleep better at night"
        };

        for (String principle : principles) {
            printCentered(principle + RESET);
            Thread.sleep(400);
        }

        printSeparator();
        Thread.sleep(300);

        // Final Message
        System.out.println("\n\n");
        System.out.println(BOLD_YELLOW);
        printCentered("✨ New Year. New Stack. New Standards. ✨");
        System.out.println(RESET);
        
        System.out.println(BOLD_GREEN);
        printCentered("🎯 2026 Goals: Master 1 Framework | Build 12 Projects | Mentor 4 Devs");
        System.out.println(RESET);
        
        System.out.println(BOLD_BLUE);
        printCentered("🚀 Let's build software that matters.");
        System.out.println(RESET);
        
        System.out.println(BOLD_PURPLE);
        printCentered("⚡ Happy New Year 2026, fellow developers! ⚡");
        System.out.println(RESET);
        
        System.out.println("\n\n");
        
        // Simple fireworks animation
        fireworksAnimation();
    }
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    private static void printCentered(String text) {
        int terminalWidth = 80;
        int padding = (terminalWidth - text.length()) / 2;
        padding = Math.max(0, padding);
        System.out.println(" ".repeat(padding) + text);
    }
    
    private static String getCentered(String text) {
        int terminalWidth = 80;
        int padding = (terminalWidth - text.length()) / 2;
        padding = Math.max(0, padding);
        return " ".repeat(padding) + text;
    }
    
    private static void printSeparator() {
        System.out.println(BOLD_BLUE + getCentered("=".repeat(60)) + RESET);
    }
    
    private static void fireworksAnimation() throws InterruptedException {
        String[] fireworks = {
            "          *          ",
            "         * *         ",
            "        *   *        ",
            "       *     *       ",
            "      *       *      ",
            "     *         *     ",
            "    *           *    ",
            "   *             *   ",
            "  *               *  ",
            " *                 * ",
            "*                   *",
            "         |||         ",
            "         |||         ",
            "         |||         "
        };
        
        System.out.println(BOLD_CYAN);
        printCentered("🎆 2026 FIREWORKS CELEBRATION 🎆");
        System.out.println(RESET);
        
        String[] colors = {BOLD_RED, BOLD_YELLOW, BOLD_GREEN, BOLD_BLUE, BOLD_PURPLE, BOLD_CYAN};
        
        for (int firework = 0; firework < 3; firework++) {
            String color = colors[firework % colors.length];
            
            // Launch firework
            for (int i = 0; i < fireworks.length; i++) {
                System.out.print(color);
                printCentered(fireworks[i]);
                TimeUnit.MILLISECONDS.sleep(100);
            }
            
            // Explosion
            System.out.println(color);
            printCentered("    ✨ * ✨ * ✨ * ✨    ");
            printCentered("  ✨   *   ✨   *   ✨  ");
            printCentered("✨     *     *     ✨");
            printCentered("  ✨   *   ✨   *   ✨  ");
            printCentered("    ✨ * ✨ * ✨ * ✨    ");
            System.out.println(RESET);
            
            TimeUnit.MILLISECONDS.sleep(800);
            
            // Clear the animation
            for (int i = 0; i < 20; i++) {
                System.out.print("\033[1A"); // Move cursor up
                System.out.print("\033[2K"); // Clear line
            }
        }
        
        // Final display
        System.out.println("\n\n");
        System.out.println(BOLD_RED);
        printCentered("╔══════════════════════════════════════╗");
        printCentered("║                                      ║");
        printCentered("║         WELCOME TO 2026! 🎉         ║");
        printCentered("║                                      ║");
        printCentered("╚══════════════════════════════════════╝");
        System.out.println(RESET);
        
        System.out.println("\n");
        printCentered(BOLD_GREEN + "May your code compile on the first try!" + RESET);
        printCentered(BOLD_BLUE + "May your bugs be few and your coffee strong!" + RESET);
    }
}
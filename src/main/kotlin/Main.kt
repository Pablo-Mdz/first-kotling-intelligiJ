fun main() {
    //Schreibe hier deinen Code

    println("Ich werde Ihnen einige Fragen stellen ...")
    println("Wie heiß du? (bitte confirm mit ENTER)")
    var name = readln()

    println("Willkommen $name!")
    println("wie alt bist du? (bitte confirm mit ENTER)")
    var alt = readln()
    println("richtig? $alt?  du bis sehr alt $name... ")
    println("Jetz ")

    println("Können Sie jetzt eine Nummer nennen? ")
    var nummer1 = readln().toBigInteger()
    println("jetzt andere nummer bitte? ")
    var nummer2 = readln().toBigInteger()
    var nummerResult = nummer1 + nummer2
    println("die summe auf beides Nummer sind: $nummerResult")
}

fun BMI() {
    /* Berechnung des Body-Mass-Index (BMI)

    Schreibe ein Programm in Kotlin, das den Body-Mass-Index (BMI) einer Person berechnet. Der BMI wird anhand des Gewichts und der Körpergröße berechnet. Verwende die folgenden Schritte und überleg dir, welche Datentypen du brauchst:

    Frage den Benutzer nach seinem Namen.
    Sprich den User mit seinem Namen an und frage nach seinem Gewicht in Kilogramm.
    Frage den Benutzer zudem nach seiner Körpergröße in Metern.
    Berechne den BMI mit der Formel: BMI = Gewicht / (Körpergröße * Körpergröße)
    Gib den berechneten BMI aus. */

    println("Lass uns deine Körpermasse berechnen")
    println("Bitte geben Sie Ihr Gewicht (in kg) an")
    var gewicht = readln().toDouble()
    println("jetzt deine Körpergröße (in Zentimetern und nur die Zahl, zum Beispiel: 180)")
    var korpergr = readln().toDouble() / 100
    var result = gewicht / (korpergr * korpergr)

    println("Deine BMI ist : $result")
}

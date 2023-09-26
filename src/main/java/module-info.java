module es.ieslosmontecillos.hello_word {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.hello_word to javafx.fxml;
    exports es.ieslosmontecillos.hello_word;
}
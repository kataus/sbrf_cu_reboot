package ru.itvitality.sbrf.cu.j2003.l04.example.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("OpenedConsoleIOService ")
class OpenedIOServiceTest {

    private static final String EOL = System.lineSeparator();

    private static final String TEXT_TO_PRINT1 = "Ничто не истинно";
    private static final String TEXT_TO_PRINT2 = "Все дозволено";
    private ByteArrayOutputStream bos;
    private ConsoleContext consoleContext;
    private IOService ioService;

    @BeforeEach
    void setUp() {
        System.out.println( Thread.currentThread().getName() );

        bos = new ByteArrayOutputStream();
        consoleContext = new ConsoleContext( new PrintStream( bos ), System.in );
        ioService = new OpenedConsoleIOService( consoleContext );
    }

    @DisplayName("должно печатать \"" + TEXT_TO_PRINT1 + "\"")
    @Test
    void shouldPrintOnlyFirstCreedLine() throws InterruptedException {
        ioService.out( TEXT_TO_PRINT1 );
        Thread.sleep( 1000 );
        assertThat( bos.toString() ).isEqualTo( TEXT_TO_PRINT1 + EOL );
    }

    @DisplayName("должно печатать \"" + TEXT_TO_PRINT2 + "\"")
    @Test
    void shouldPrintOnlySecondCreedLine() {
        ioService.out( TEXT_TO_PRINT2 );
        assertThat( bos.toString() ).isEqualTo( TEXT_TO_PRINT2 + EOL );
    }
}

/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final String DUEÑO = "Sócrates";
        final String MENSAJE1 = "¡Ave César!";
        final String MENSAJE2 = "¡Sócrates socorro!";

        String nombre;
        String mensajeLoro;

        System.out.println("Alternativa Loro");
        System.out.println("================");

        System.out.print("Persona que se acerca ..: ");
        nombre = SCN.nextLine();

        System.out.println("---");

        if (nombre.equals(DUEÑO)) {
            mensajeLoro = MENSAJE1;
        } else {
            mensajeLoro = MENSAJE2;
        }

        System.out.printf("Dueño del loro .........: %s%n", DUEÑO);

        System.out.println("---");

        System.out.printf("Mensaje loro ...........: %s%n", mensajeLoro);
    }

}

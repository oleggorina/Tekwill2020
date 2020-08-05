package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication.getInfo());

        Publication newspaper = new Newspaper("Footbal results", "Sport news");
        System.out.println(newspaper.getInfo());

        Publication article = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(article.getInfo());

        Publication announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getInfo());
    }
}

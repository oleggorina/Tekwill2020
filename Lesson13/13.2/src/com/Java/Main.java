package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication.getInfo());

        Newspaper newspaper = new Newspaper("Footbal results", "Sport news");
        System.out.println(newspaper.getInfo());

        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(article.getInfo());

        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getInfo());
    }
}

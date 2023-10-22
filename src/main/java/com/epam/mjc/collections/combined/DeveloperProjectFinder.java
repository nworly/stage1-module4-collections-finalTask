package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsToSearch = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String project = entry.getKey();
            Set<String> devs = entry.getValue();

            if (devs.contains(developer)) {
                projectsToSearch.add(project);
            }
        }

        projectsToSearch.sort(Comparator.comparing(String::length).reversed()
                .thenComparing(Comparator.reverseOrder()));

        return projectsToSearch;
    }
}

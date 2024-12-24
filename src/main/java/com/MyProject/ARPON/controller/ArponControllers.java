package com.MyProject.ARPON.controller;

import com.MyProject.ARPON.entry.Entry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("arpon")
public class ArponControllers {
    private Map<Long, Entry> entry = new HashMap<>();

    @GetMapping //("/abc")
    public List<Entry> getAll() {
        return new ArrayList<>(entry.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody Entry myentry) {
        entry.put(myentry.getId(), myentry);
        return true;
    }

    @GetMapping("id/{myId}")
    public Entry getEntryById(@PathVariable long myId) {
        return entry.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public Entry deleteEntryById(@PathVariable long myId) {
        return entry.remove(myId);
    }

    @PutMapping("/id/{id}")
    public Entry updateEntry(@PathVariable Long id, @RequestBody Entry myentry) {
        return entry.put(id, myentry);
    }


}

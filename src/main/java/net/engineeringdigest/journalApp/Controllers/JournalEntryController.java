package net.engineeringdigest.journalApp.Controllers;

import net.engineeringdigest.journalApp.Entity.JournalEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JournalEntryController {

    private Map<Long, JournalEntry> JournalEntries = new HashMap<>();
    public List<JournalEntry> getAll()
    {
        return new ArrayList<>(JournalEntries.values());
    }
}

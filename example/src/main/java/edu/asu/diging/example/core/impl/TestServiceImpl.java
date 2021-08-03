package edu.asu.diging.example.core.impl;

import org.springframework.stereotype.Service;

import edu.asu.diging.example.core.TestService;

@Service
public class TestServiceImpl implements TestService {

    /* (non-Javadoc)
     * @see edu.asu.diging.example.core.ITestService#helloWorld(java.lang.String)
     */
    @Override
    public String helloWorld(String name) {
        return "Hello " + name;
    }
}

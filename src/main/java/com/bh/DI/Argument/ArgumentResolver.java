package com.bh.DI.Argument;

import com.bh.DI.Argument.Argument;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
